package com.zhiyou100.day05;

public class ZuoYe2 {

	public static void main(String[] args) {

//		��չ��2����ӡ���1��100����������
		//ʹ��ѭ���ñ���n��1�ܵ�100
		for (int n = 1; n<=100; n++) {
			//�жϵ�ǰn�ǲ�������
			int b=0;//������Ϊ��ǩ  ��¼n�Ƿ񱻳�����
			//ʹ��ѭ���ñ���m��2�ܵ�n�Ŀ�ƽ��
			for(int m=2;m<=Math.sqrt(n);m++) {
				if(n%m==0) {b++;}
			}
			//ѭ����� ͨ���ж�b��ֵ�Ƿ������ ���ж�n�Ƿ񱻳�����  �������ж�n�ǲ�������
			if(n!=1&&b==0) {
				System.out.println("n="+n+"������");
			}
		}
		
//		��չ��3����1��100������������ƽ��ֵ
		//��ȡƽ��ֵ  �Ȼ�ȡ�ͺ͸���
		double sum=0;
		int geShu=0;
		//ͨ��ѭ�� ��һ��������1�ܵ�100
		for (int n = 1; n <=100; n++) {
			//�жϵ�ǰn�ǲ�������
			int b=0;//���������Ϊ��ǩ
			//ʹ��ѭ�� ��m��2�ܵ�n�Ŀ���
			for (int m = 2; m <=Math.sqrt(n); m++) {
				  if(n%m==0) {b++;break;}
			}
			//ͨ���жϱ�ǩ��ֵ�Ƿ������ ���ж�n�ǲ�������
			if(n!=1&&b==0) {
				sum+=n;
				geShu++;
			}
		}
		//���е�n�ж����  ��ȡƽ��ֵ
		System.out.println("ƽ��ֵ�ǣ�"+sum/geShu);
	}

}
