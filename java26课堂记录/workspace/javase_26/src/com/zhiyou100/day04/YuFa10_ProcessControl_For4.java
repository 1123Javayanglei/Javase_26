package com.zhiyou100.day04;

public class YuFa10_ProcessControl_For4 {

	public static void main(String[] args) throws Exception{
		/*
		 * 1 ��ӡ4������ľžų˷���
		 * */
		for (int i = 1; i <=9; i++) {//���forѭ������i   ��������
			for (int j =1; j <= i; j++) {//�ڲ�forѭ������j ����ÿ�е�����
				  System.out.print(i+"*"+j+"="+i*j+(j==i?"\n":"\t"));
			}
		}
		System.out.println();
		
		for (int i = 1; i <=9; i++) {//���forѭ������i   ��������
			for (int j =9; j >=1; j--) {//�ڲ�forѭ������j ����ÿ�е�����
			     if(i<j) {
			    	 System.out.print("\t");
			     }else {
			    	 System.out.print(i+"*"+j+"="+i*j+(j==1?"\n":"\t"));
			     }
			}
		}
		System.out.println();
		for (int i =9; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
					System.out.print(i+"*"+j+"="+i*j+(j==i?"\n":"\t"));
			}
		}
		
		System.out.println("---------");
		for (int i =1; i <=9; i++) {
			 for (int j = 1; j <=9; j++) {
				 if(i>j) {
					 System.out.print("\t");
				 }else {
					 System.out.print(i+"*"+j+"="+i*j+(j==9?"\n":"\t"));
				 }
			}
		}
		//���forѭ������i ��������
		//�ڲ�forѭ������j ��������
		
		
//		 * 2ʲô������������   �ж�һ�����ǲ�������
//		 *    ������������1���䱾�� ���ܱ���������������  ��֮Ϊ����  ע�⣺1 ��������
//		 *         6 = 1 6  2 3 ��������
//		 *         7 = 1 7    ������
		  //  n%m ��m����nʱ  n��Զ�����ܱ�m����
		  //   �ж�n�Ƿ���Ա�����1��n�������������  
		  //ֻ�ÿ��� ��nС��������  �Ƿ��������n
		  //ͨ��ѭ����m ��2�ܵ�n-1  �ж�m�Ƿ���Գ���n ֻҪ��һ�γ���n�Ͳ�������
		   int n=1;
		   boolean b=false;//���������Ϊ��ǩ ��¼n�Ƿ񱻳�����
		   for(int m=2;m<n;m++) { //ʹ��ѭ����m�����б�nС��������
			   if(n%m==0) {
				   b=true;
			   }
		   }
		   //ͨ���ж�b��ֵ�Ƿ���� ���ж�n�Ƿ񱻳����� �������ж�n�ǲ�������
		   if(n==1||b==true) {
			   System.out.println("n="+n+",��������!");
		   }else {
			   System.out.println("n="+n+",������!");
		   }
	}
}
