package com.zhiyou100.day05;

public class LianXi2 {

	public static void main(String[] args) {
	

		
		int[] arr1=new int[]{1,3,5,7,8,9,0,4,5,6};
		int[] arr2;
		//arr2={1,3,5,7,8,9,0,4,5,6};//��ʽ��Ҫ�� �����������ʹ�����������ֿܷ�д
		
//      5 ��һ��10��intԪ�ص����� ���Ϊ2������  һ��װ���� һ��װż��		
		int[] arr= {1,3,5,7,8,9,0,4,5,6};
		//������������������ȷԪ�����ͺ�Ԫ�ظ���
		//��ȡż������
		int os=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {os++;}
		}
		//���������������
		int[] arrOS=new int[os];
		int[] arrJS=new int[arr.length-os];
		//��Ԫ�ظ�ֵ
		for (int i = 0,j=0,k=0; i < arr.length; i++) {//j��Ϊż��������±�  k��Ϊ����������±�
			 if(arr[i]%2==0) {
				 arrOS[j]=arr[i];
				 j++;
			 }else {
				 arrJS[k]=arr[i];
				 k++;
			 }
		}
		//������ӡ����
		for (int i = 0; i < arrJS.length; i++) {
			System.out.print(arrJS[i]+(i==arrJS.length-1?"\n":","));
		}
		for (int i = 0; i < arrOS.length; i++) {
			System.out.print(arrOS[i]+(i==arrOS.length-1?"\n":","));
		}
		
		
		//6 ��һ��10��intԪ�ص�����arr  ����һ���������е�Ԫ��Ҫ��arr��Ԫ��˳��ߵ�
		// 1 2 3 4 0 ---- 0 4 3 2 1
		//����һ��������  Ԫ�ظ����͵�ǰԪ�ظ���һ��
		int[] arrNew=new int[arr.length];
		//��arr�е�Ԫ�ص���װ��arrNew��
		for (int i = arr.length-1,j=0; i >=0; i--,j++) {
			arrNew[j]=arr[i];
		}
		//0-----��arr.length-1
		//1----->arr.length-2
		//2----->arr.length-3
		for (int i = 0; i <arr.length; i++) {
			arrNew[arr.length-i-1]=arr[i];
		}
		
		//�������������Ԫ��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+(i==arr.length-1?"\n":","));
		}
		for (int i = 0; i < arrNew.length; i++) {
			System.out.print(arrNew[i]+(i==arrNew.length-1?"\n":","));
		}
		
		//������ʵ�ܼ�  ����Ϊ���е�����Ԫ���ṩһ��ͳһ�ķ��ʷ�ʽ��������+����
		
		//1 ����һ��װ10��intԪ�ص�����  ��ȡ�δ�ֵ
		//2����һ��װ10��doubleԪ�ص�����  �����е����б������1λ��С��
		//{1.2234,1.456,1.678}  ---{1.2,1.4,1.6}
		
		
	}

}
