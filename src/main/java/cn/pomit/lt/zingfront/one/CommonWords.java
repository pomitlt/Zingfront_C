package cn.pomit.lt.zingfront.one;

public class CommonWords {
	
	public static void main(String sasd[]){
		String one = "This is C programming text";
		String two = "This is a text for C programming";
		
		String keywords = keyWords(one, two);
		
		System.out.println(keywords);
		
		String oneAdd = "There are Java text programmings ";
		String twoAdd = "This is a text for C programming";
		
		String keywordsAdd = keyWords(oneAdd, twoAdd);
		
		System.out.println(keywordsAdd);
	}

	/**
	 * 选出第二长公共字符串
	 * @param one 参数1
	 * @param two 参数2
	 * @return
	 */
	private static String keyWords(String one, String two) {
		String oneArr[] = one.split(" ");
		String twoArr[] = two.split(" ");
		//2个长度字符串数组存储第一第二长字符串
		String retArr[] = new String[2];
		for(String itemOne : oneArr){
			for(String itemTwo : twoArr){
				if(itemOne.equals(itemTwo)){
					if(retArr[0] == null || "".equals(retArr[0])){
						retArr[0] = itemOne;
					}else if(retArr[1] == null || "".equals(retArr[1])){
						if(retArr[0].length() > itemOne.length()){
							retArr[1] = itemOne;
						}else{
							retArr[1] = retArr[0];
							retArr[0] = itemOne;
						}		
					}else if(itemOne.length() <= retArr[0].length()){
						if(retArr[1].length() < itemOne.length()){
							retArr[1] = itemOne;
						}
					}else{
						retArr[1] = retArr[0];
						retArr[0] = itemOne;
					}
				}
			}
		}
		if(retArr[0] == null || "".equals(retArr[0])){
			return null;
		}
		if(retArr[1] == null || "".equals(retArr[1])){
			return retArr[0];
		}
		
		return retArr[1];
	}
	
	
}
