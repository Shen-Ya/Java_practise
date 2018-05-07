import java.util.Arrays;

public class ArrayToHeavy01 {
	/**
	 * 数组去重
,	 * @param args
	 */
	public static void main(String[] args) {
		boolean flag;
		int count =  0;
		int m = 0;
		//定义数组
		int [] arrNum = {1,5,4,6,6,8};
		System.out.println("原数组为："+ Arrays.toString(arrNum));
		int [] arrNumNew = new int [arrNum.length];
		System.out.print("去重后为：");
		//用二重循环比较是否存在
		for (int i = 0; i < arrNum.length; i++) {
			flag = false;
			for (int j = 0; j < arrNumNew.length; j++) {
				if(arrNum[i]==arrNumNew[j]){
					count++;
					flag = true;
					break;
				}
			}
			//不存在则插入
			if(flag == false){
				arrNumNew[m++] = arrNum[i];
			}
			
		}
		//打印数组
		for (int i = 0; i < (arrNumNew.length-count); i++) {
			System.out.print(+arrNumNew[i] + ", ");
		}
	}
	
}
