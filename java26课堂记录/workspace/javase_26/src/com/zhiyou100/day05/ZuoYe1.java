package com.zhiyou100.day05;

public class ZuoYe1 {

	public static void main(String[] args) {
//		for (int i = 1; i < 100; i++) {
//			System.out.println("Math.sqrt("+i+")"+Math.sqrt(i));
//		}
//		1 ��ӡ�ĸ�����ĳ˷��ھ�
//		2 �ж�һ�����ǲ�������
		int n=19;//���������¼���жϵ�����
		int b=0;//������Ϊ��ǩ  ��¼n�Ƿ񱻳�����
		//ʹ��ѭ���ñ���m��2�ܵ�n�Ŀ�ƽ��
		for(int m=2;m<=Math.sqrt(n);m++) {
			if(n%m==0) {b++;}
		}
		//ѭ����� ͨ���ж�b��ֵ�Ƿ������ ���ж�n�Ƿ񱻳�����  �������ж�n�ǲ�������
		if(n!=1&&b==0) {
			System.out.println("n="+n+"������");
		}else {
			System.out.println("n="+n+"��������");
		}
		
//		3 ʹ��forѭ���� Բ���ʵ�����дһ��
		//���������¼Բ���ʺʹ���
		double PI=0;
		int ciShu;
		for (ciShu= 1; PI<3.1415926||PI>3.1415927; ciShu++) {
			   //��ȡÿ�μ���PI����
			   double num=4.0/(ciShu*2-1);
			   PI+=(ciShu%2==0?-1*num:num);
		}
		System.out.println("PI="+PI+",ciShu="+(ciShu-1));
		
		
//		4 ʹ��forѭ�� ��ȡ���е�ˮ�ɻ���
		//1 ��λ��  2����λ����ֵ�����η�֮�͵��ڴ���
		//ͨ��ѭ�������еĿ�������
		for (int i = 100; i < 1000; i++) {
			//�ж�i�ǲ���ˮ�ɻ���
			int ai=i%10,bi=i/10%10,ci=i/100;
			//��ȡ����λ�������η�֮��
			int sum=ai*ai*ai+bi*bi*bi+ci*ci*ci;
			if(sum==i) {
				System.out.println(i+"��ˮ�ɻ�����");
			}
		}
		
//		5 ������ı������
//		��չ��1�� �ж�һ��������n�Ǽ�λ��
		 //ͨ��ѭ�� ��nѭ������10 ֱ��������0����������12345/10=1234/10=123/10=12/10=1/10=0
		n=1;
		int t=n;//���������¼n��ǰ��ֵ
		for (ciShu=0;n!=0;ciShu++) {
			n=n/10;
			System.out.println("n="+n);
		} 
		System.out.println(t+":::��"+ciShu+"λ����");
		
//		��չ��2����ӡ���1��100����������
	
		
//		��չ��3����1��100������������ƽ��ֵ

	}

}
