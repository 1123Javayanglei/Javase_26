package com.zhiyou100.day02;

public class YuFa04_Operator {

	public static void main(String[] args) {
		//+�����ӷ�����
		System.out.println(1+1);
		byte b1=11;
		byte b2=(byte)(b1+b1);//1�� byte short char����ֱ�Ӳμ�����  �������Զ�ת��Ϊint��������		
		// Type mismatch: cannot convert from into byte
		short s1=1;
		int i1=1;
		long l1=1;
		float f1=1;
		double d1=1;
		//s1=s1+i1;//short+int=int
		//s1=s1+i1+l1;//short+int+long=long
		//s1=s1+i1+l1+f1;//short+int+long+float=float
		//2�������������������ȡ���� ������ߵ�����
		
		//+������Ϊ������
		System.out.println(+1);
		
		//+������Ϊ�ַ������ӷ�
		//�ַ�������ӡ�������д�˫���ŵľ����ַ���
		System.out.println("111aahha�л�");//"111aahha"�����ַ���
		//�κ����ݺ��ַ������� ���γ�һ���µ��ַ���
		System.out.println("abc"+12);//"abc12"
		System.out.println("abc"+true+1);//"abctrue1"
		System.out.println(1+1+2+3+4);//��������㸴�ӵ�ʽ�� ��Զ���Ǵ�������������
		System.out.println(1+2+3+"abc"+1+2);//"6abc12"
		System.out.println(2.0-1.1);//0.8999999999999999: float��double��������ʱ ����־��ȶ�ʧ
		//20/10  2000000001/1000000000
		//1.1  --->(1.04,1.15)
		
		System.out.println("s1="+s1);//s1=1
		
		
		//%:::n%m= n����m�õ�һ������ ���������ǲ���
		System.out.println(1/2);//1/2=0
		System.out.println(10%3);//10/3=3 �������ǲ�����1
		System.out.println(3%5);// 3/5=0   �������ǲ���3
		System.out.println(4.5%2.1);//����������ȡ���� ���ӵ�����
		System.out.println(-4.5%-2.1);
		System.out.println(-4.5%2.1);
		System.out.println(4.5%-2.1);
		
		//++ ����  -- �Լ�
		int a=3;
		a++;//�ȼ���a=a+1; �ȼ���++a;
		System.out.println("a="+a);//a=4
		a--;//�ȼ���a=a-1;  �ȼ���--a;
		System.out.println("a="+a);//a=3
		
		//�Ƚ������
		System.out.println(1>=2);//false
		System.out.println(1==2);
		System.out.println(1==1.1);
		System.out.println(1.1==1.1f);//false
		
		//��ֵ�����
		a=4;
		a+=3;//�ȼ���a=(a������)(a+3);
		System.out.println("a="+a);//a=7
		a%=5;//�ȼ���a=(a������)(a%5);
		System.out.println("a="+a);//a=2
		
		short s=1;
		s+=1;
		s=(short)(s+1);
		
		
		
		

	}

}
