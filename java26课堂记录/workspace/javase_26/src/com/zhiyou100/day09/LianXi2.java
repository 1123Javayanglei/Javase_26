package com.zhiyou100.day09;

public class LianXi2 {

	public static void main(String[] args) {
		getQinMiShu();
	}
	//���a������֮�͵���b  b������֮�͵���a  ��ʱa��b��������  ��3000���ڵ�����������
	//n%m==0  ����m!=n ��ʱm��n������
	public static void getQinMiShu() {
		for (int a = 1; a < 3000; a++) {
			int sumA=getYinZiHe(a);//��ȡa������֮��
			int  b=sumA;
			int sumB=getYinZiHe(b);//��ȡb������֮��
			if(a==sumB) {
				System.out.println(a+"��"+b+"��������");
			}
		}
	}
	//дһ�����������n������֮��
	public static int getYinZiHe(int n) {
			int sum=0;//��ȡn������֮��
			for (int m = 1; m <=n/2; m++) {//���������1�ܵ�n/2 ��ȡn���е�����
				if(n%m==0) {
					sum+=m;
				}
			}
			return sum;
	}

}
