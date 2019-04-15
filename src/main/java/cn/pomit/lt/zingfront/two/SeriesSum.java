package cn.pomit.lt.zingfront.two;

public class SeriesSum {
	public static void main(String sasd[]) {
		int n = 25;

		printSeriesNums(n);
	}

	private static void printSeriesNums(int n) {
		boolean flag = false;
		for (int start = 1; start < n; start++) {
			for (int end = start + 1; end < n; end++) {
				int sum = (start + end) * (end - start + 1) / 2;
				if (sum == n) {
					flag = true;
					for (int i = start; i <= end; i++)
						System.out.print(i + "  ");
					System.out.println();
				}
			}
		}
		if (!flag)
			System.out.println("NONE");
	}
}
