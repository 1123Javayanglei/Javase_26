package com.zhiyou100.day04;

public class YuFa10_ProcessControl_For3 {

	public static void main(String[] args) throws Exception{
		//forѭ���б��������÷�Χ
		int a=1;            //����a::forѭ������ı���    ����������main����
		for(int b=1;a<10;) {//����b::forѭ����ʼ������ж���ı��� ������������forѭ��
			int c=1;        //����c::forѭ�����ж���ı���     �������Ǳ���ѭ��
			//Thread.sleep(200);
			System.out.println("a:b:c="+a+":"+b+":"+c);
			a++;b++;c++;
		}
		System.out.println("a:"+a);//����aѭ�������Է��ʵ�  ����bc ��forѭ��������ʲ���
		//Unreachable code
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.println("i="+i+",j="+j);
			}
		}
		
		System.out.println("-----------");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				if(i*j<10) {
					System.out.print(i+"*"+j+"="+i*j+"   ");
				}else {
					System.out.print(i+"*"+j+"="+i*j+"  ");
				}
			}
			System.out.println();//��ӡһ������
		}
		System.out.println("-----------");
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();//
		}
		
		
//		char c='1';
//		c='t';//t�ַ�
//		c='\t';// \t���Ʊ��  
//		c='\n';// \n���Ʊ��  
//		System.out.println(c);
//		System.out.println(111);
		
		/*
		 * 1 ��ӡ4������ľžų˷���
		 * 2ʲô������������   �ж�һ�����ǲ�������
		 *    ������������1���䱾�� ���ܱ���������������  ��֮Ϊ����
		 *         6 = 1 6  2 3 ��������
		 *         7 = 1 7    ������
		 *         ע�⣺1 ��������
		 * */
	}
}
