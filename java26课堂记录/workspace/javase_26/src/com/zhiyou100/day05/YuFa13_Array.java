package com.zhiyou100.day05;

public class YuFa13_Array {

	public static void main(String[] args) {
		int[] intArr=new int[10];//����һ��������arr ����ָ��һ��װ10��intԪ�ص��������
		//1 ����һ��������intArr                :::::::int[] arr
		//2 ����һ��װ10��int����Ԫ�ص��������          :::::::new int[10];
		//3  ����ߵ�������intArr ָ���ұߴ������������::::::: =
		
		//�����ʹ��ע������1: �����е�Ԫ����Ĭ��ֵ��ֵȡ����Ԫ�ص�����
		// byte short int  long float double����Ԫ�� Ĭ��ֵ�Ƕ�Ӧ���͵�0
		// char ����Ԫ��Ĭ��ֵ��0�����ڱ�����ж�Ӧ���ַ� ' '
		// boolean ����Ԫ��Ĭ��ֵ��false
		
		System.out.print("int���飺����");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+(i==intArr.length-1?"\n":","));
		}
		byte[] byteArr=new byte[10];
		System.out.print("byte���飺����");
		for (int i = 0; i < byteArr.length; i++) {
			System.out.print(byteArr[i]+(i==byteArr.length-1?"\n":","));
		}
		short[] shortArr=new short[10];
		System.out.print("short���飺����");
		for (int i = 0; i < shortArr.length; i++) {
			System.out.print(shortArr[i]+(i==shortArr.length-1?"\n":","));
		}
		long[] longArr=new long[10];
		System.out.print("long���飺����");
		for (int i = 0; i < longArr.length; i++) {
			System.out.print(longArr[i]+(i==longArr.length-1?"\n":","));
		}
		float[] floatArr=new float[10];
		System.out.print("float���飺����");
		for (int i = 0; i < floatArr.length; i++) {
			System.out.print(floatArr[i]+(i==floatArr.length-1?"\n":","));
		}
		double[] doubleArr=new double[10];
		System.out.print("double���飺����");
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.print(doubleArr[i]+(i==doubleArr.length-1?"\n":","));
		}
		boolean[] booleanArr=new boolean[10];
		System.out.print("boolean���飺����");
		for (int i = 0; i < booleanArr.length; i++) {
			System.out.print(booleanArr[i]+(i==booleanArr.length-1?"\n":","));
		}
		char[] charArr=new char[10];
		System.out.print("char���飺����");
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]+(i==charArr.length-1?"\n":","));
		}
		System.out.println((int)(charArr[0]));//0
		
		
		//ע������2�� Ԫ���±�ȡֵ��Χ��0��length-1��
		intArr=new int[10];
		//System.out.println(intArr[11]);
		
		//ע������3��һ��new����һ���µ��������
		int[] arr=new int[11];//����һ��������arr ��ָ��һ��װ11��intԪ�ص��������
		arr[0]=11;
		arr=new int[11];//��������arr ָ��һ���µ��������
		int[] arr1;//����һ��������
		arr1=arr;//��arr1ָ��arrָ����������   �ȼ��ڸ�66�е��������������������
		arr1[0]=19;
		System.out.println(arr[0]);//19

	}
}
