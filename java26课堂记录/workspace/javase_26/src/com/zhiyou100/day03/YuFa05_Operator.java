package com.zhiyou100.day03;

public class YuFa05_Operator {

	public static void main(String[] args) {
		System.out.println("����&&˫��---");
		System.out.println("true&&true="+(true&&true));//true
		System.out.println("true&&false="+(true&&false));//false
		System.out.println("false&&true="+(false&&true));//false
		System.out.println("false&&false="+(false&&false));//false
		System.out.println("����&����---");
		System.out.println("true&true="+(true&true));//true
		System.out.println("true&false="+(true&false));//false
		System.out.println("false&true="+(false&true));//false
		System.out.println("false&false="+(false&false));//false
		
		System.out.println("����||˫��---");
		System.out.println("true||true="+(true||true));//true
		System.out.println("true||false="+(true||false));//true
		System.out.println("false||true="+(false||true));//true
		System.out.println("false||false="+(false||false));//false
		System.out.println("����|����---");
		System.out.println("true|true="+(true|true));//true
		System.out.println("true|false="+(true|false));//true
		System.out.println("false|true="+(false|true));//true
		System.out.println("false|false="+(false|false));//false
		
		System.out.println("����^���---");
		System.out.println("true^true="+(true^true));//false
		System.out.println("true^false="+(true^false));//true
		System.out.println("false^true="+(false^true));//true
		System.out.println("false^false="+(false^false));//false
		System.out.println("����!ȡ��--");
		System.out.println("!true="+(!true));//false
		System.out.println("!false="+(!false));//true
		
		
		System.out.println("����λ�����");
		System.out.println("19&5="+(19&5));//1
		System.out.println("19|5="+(19|5));//23
		System.out.println("19^5="+(19^5));//22
		System.out.println("9>>2="+(9>>2));//2    1001����2λ  �ȼ���ɾ������λ
		System.out.println("9<<2="+(9<<2));//36   1001����2λ �ȼ����ұ߼�������100100
		//19�Ķ����ƣ�
		//1234=1*1000+2*100+3*10+4*1
		//19=16+2+1=10000+10+1=10011
		//9=8+1=1001
		//5=4+1=101
		
		System.out.println("������Ԫ���ʽ��������");
		System.out.println(1>2?3:4);
		int i=(3<=4?6:7);
		
		int a=3;int b=5;int c=9;
		int max=a>b?a:b;//���������еĴ�ֵ
		System.out.println("max="+max);//max=5
		//a=3,b=5,max=5
		System.out.println("a="+a+",b="+b+",max="+max);
		
		//���������еĴ�ֵ
		//�Ȼ�ȡa��b�Ĵ�ֵ  Ȼ���ô˴�ֵ��c���Ƚϼ���
		max=a>b?a:b;
		max=max>c?max:c;
		//a=?,b=?,c=?,���ֵ��?
		System.out.println("a="+a+",b="+b+",c="+c+",���ֵ��"+max);
		
		max=((a>b&&a>c)?a:(b>c?b:c));
		max=(a>b)?(a>c?a:c):(b>c?b:c);
		
		

	}

}
