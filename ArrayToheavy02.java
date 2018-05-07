import java.util.Arrays;

public class ArrayToHeavy02 {
	/**
	 * 数组去重
	 * @param args
	 */
	public static void main(String[] args) {
		//定义一个数组
		int [] strNum = {1,2,4,5,3,4,3,6,6,8};
		System.out.print("原数组为：" + Arrays.toString(strNum));
		System.out.println();
		int [] strNumNew = deleteRepeat(strNum);
		System.out.print("去重后为：" + Arrays.toString(strNumNew));
	}
	
	//传入一个数组，返回去重后的数组
	public static int [] deleteRepeat(int [] strNum){
		
		//声明一个临时数组
		int [] strNumTemp = new int[strNum.length];
		//count用于去重后数组的长度
		int count = 0;
		//遍历数组
		for (int i = 0; i < strNum.length; i++) {
			//声明一个标记，判断是否重复
			boolean flag = true;
			//循环逐个对比，是否有重复元素
			for (int j = i+1; j < strNum.length; j++) {
				//若重复，则标记标记变为false，并结束内存循环
				if(strNum[i]==strNum[j]){
					flag = false;
					break;
				}
			}
			//判断标记是否改变
			//如果没有改变就把原数组的元素赋值给临时数组，count+1
			if(flag){
				strNumTemp[count] = strNum[i];
				count++;
			}	
		}
		//声明最后要返回的数组
		int [] strNumNew  = new int [count];
		//用arraycopy方法把刚才去重的数组拷贝到新数组中并返回
		System.arraycopy(strNumTemp, 0, strNumNew, 0, count);
		return strNumNew;
	}
	
}
