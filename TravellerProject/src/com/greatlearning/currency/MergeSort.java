package com.greatlearning.currency;

public class MergeSort {
	

		public void mergeSort(int[] array, int left, int right) {
			if (left < right) {
				int mid = (left + right) / 2;

				mergeSort(array, left, mid);
				mergeSort(array, mid + 1, right);

				merging(array, left, mid, right);

			}

		}

		private void merging(int[] array, int left, int mid, int right) {

			int i = left;
			int j = mid + 1;
			int k = left;

			int[] temparray = new int[array.length];
			while (i <= mid && j <= right) {
				if (array[i] >= array[j]) {
					temparray[k] = array[i];
					i++;
				} else {
					temparray[k] = array[j];
					j++;
				}
				k++;

			}
			if (i > mid) {
				while (j <= right) {
					temparray[k] = array[j];
					j++;
					k++;
				}
			}
			if (j > right) {
				while (i <= mid) {
					temparray[k] = array[i];
					i++;
					k++;
				}
			}

			for (int copy = left; copy <= right; copy++) {
				array[copy] = temparray[copy];
			}
		}
	}



