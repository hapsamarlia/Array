int[] arr= {1,2,3,4};
		int[] arr2= {2,5,4,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if (arr[i]==arr2[j]) {
					System.out.println(arr[i]);
				}
			}
		}
