package com.zhiyou100.day02;

public class YuFa02_TypeChange {

	public static void main(String[] args) {
		//��������ת����
		//�������;��ȱ�double > float >long > int(char) > short > byte
		//ʲô���͵ı�����ֻ�ܸ�ֵʲô���͵�ֵ��������������ֵ�����ͱ���ͱ���������һ��
		float f1=11;
		//1 ���ڴ��л���һ��������������float �����С4���ֽ� ��������f1
		//2 ��int����4���ֽڵ�11  �Զ�ת��Ϊfloat����4���ֽڵ�11.0f
		//3 ��float���͵�11.0f ��ֵ��float���͵ı���f1

		//�Զ�����ת�����һ���������Զ��ѵ;������� ת��Ϊ�߾�������
		//��ʽ�� �߾��ȱ���=�;�������;
		long l1=11;
		double d1=1.1f;
		d1=1;
		d1=f1;
		System.out.println(f1);//11.0f
		
		//ǿ������ת�����Ѹ߾�������ǿ��ת��Ϊ�;�������
		//��ʽ���;��ȱ���=(�;��ȱ���������)�߾�������;
		int i=(int)11.1;
		System.out.println(i);//11
		float f2=11.1f;
		f2=(float)11.1;
		
		//�Զ�����ת���������ֻ������byte short char
		//��byte short char���͵ı�����ֵint���͵ĳ���ֵ  ���Զ���� װ���¾�װ װ���¾ͱ���
		byte b1=11;//byte��Χ��[-128,127]
		short s2=-31111;
		char c1=30007;// �ѱ������30007��Ӧ���ַ���ֵ������c1
		System.out.println(c1);
		System.out.println((int)'��');
		//�����ֻʶ������ƣ�01  �����ƺ�ʮ����֮������໥ת��
		//0001  0010  0011 0100 0101 0110 0111 1000 1001 1010
		//������������ַ�֮��ת���Ķ�Ӧ��ϵ
		//�����ı����ASCII iso-8859-1 utf-8  gbk gb18030 gb2312
		
		
		//��ס���õ������ַ�������
		System.out.println((int)'0');//48
		System.out.println((int)'a');//97
		System.out.println((int)'A');//65
		
		
		
		

	}

}
