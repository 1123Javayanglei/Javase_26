package com.zhiyou100.day04;

public class ZuoYe1 {

	public static void main(String[] args) {
		//eclipseע�ͣ�ctrl+/
		
		//		1  ʹ��ifelse �����Ա�������жϳƺ�
		//	             Ů�Գƺ���СŮ��   ��Ů  ����  ����
		//		 ���Գƺ���С�к�  ˧��  ����   үү
		//		 ����ֽ��ߣ�    18    35     60
		//�����������¼�Ա������
		char sex;int age;
		sex='��';age=32;//���������� ������ֵ��Դ��ҳ��+���ݿ�
		//ͨ��ifelse���֧���жϳƺ�
		if((sex!='��'&&sex!='Ů')||(age<=0||age>=120)) {
			System.out.println("sex="+sex+",age="+age+",�Ա�������䲻�Ϸ�!");
		}else if(sex=='Ů'&&age<18) {
			System.out.println("sex="+sex+",age="+age+",�ƺ���СŮ��!");
		}else if(sex=='Ů'&&age<35) {
			System.out.println("sex="+sex+",age="+age+",�ƺ�����Ů!");
		}else if(sex=='Ů'&&age<60) {
			System.out.println("sex="+sex+",age="+age+",�ƺ��ǰ���!");
		}else if(sex=='Ů') {
			System.out.println("sex="+sex+",age="+age+",�ƺ�������!");
		}else if(age<18) {
			System.out.println("sex="+sex+",age="+age+",�ƺ���С�к�!");
		}else if(age<35) {
			System.out.println("sex="+sex+",age="+age+",�ƺ���˧��!");
		}else if(age<60) {
			System.out.println("sex="+sex+",age="+age+",�ƺ�������!");
		}else{
			System.out.println("sex="+sex+",age="+age+",�ƺ���үү!");
		}
		
		//���ж��Ա�
		if((sex!='��'&&sex!='Ů')||(age<=0||age>=120)) {
			System.out.println("sex="+sex+",age="+age+",�Ա�������䲻�Ϸ�!");
		}else if(sex=='Ů') {
			if(age<18) {//����������ж�
				System.out.println("sex="+sex+",age="+age+",�ƺ���СŮ��!");
			}else if(age<35) {
				System.out.println("sex="+sex+",age="+age+",�ƺ�����Ů!");
			}else if(age<60) {
				System.out.println("sex="+sex+",age="+age+",�ƺ��ǰ���!");
			}else {
				System.out.println("sex="+sex+",age="+age+",�ƺ�������!");
			}
		}else {//�Ա�����
			if(age<18) {
				System.out.println("sex="+sex+",age="+age+",�ƺ���С�к�!");
			}else if(age<35) {
				System.out.println("sex="+sex+",age="+age+",�ƺ���˧��!");
			}else if(age<60) {
				System.out.println("sex="+sex+",age="+age+",�ƺ�������!");
			}else {
				System.out.println("sex="+sex+",age="+age+",�ƺ���үү!");
			}
		}
		
		//	2  ʹ��while ��1��1000�������������������ĺͣ�
		//	      ������������ż�� ����λ���Ϻ���1   ��102��310
		//���������¼�ͣ�������������1�ܵ�1000
		int n1=1,sum1=0;
		//ʹ��ѭ����n1��1�ܵ�1000
		while(n1<=1000) {
			//ѭ���ж�n1�Ƿ�Ϊ������������ ���������ӾͰ�n1����sum��
			if(n1%2==0) {//�ж��Ƿ�Ϊż��
				//�ж�λ�����Ƿ���1
				int a,b,c,d;//�����ĸ�������¼����λ���ϵ�ֵ
				a=n1%10;
				b=n1/10%10;
				c=n1/100%10;//12
				d=n1/1000;
				//if(a==1||b==1||c==1||d==1) {
				if((a-1)*(b-1)*(c-1)*(d-1)==0) {//�ж�abcd���Ƿ���1
					System.out.println("n1="+n1);
					sum1+=n1;
				}
			}
			n1++;//�������
		}
		System.out.println("1��1000�������������������ĺ�="+sum1);
		
		//һ��������������ȡ���ڶ���˱����Ĵ�����
		
		//	3  ������������� ���ӡ �Ǹ������ֵ �Ǹ�����Сֵ �Ǹ����м��
		//���������¼������
		int a=3,b=5,c=9;
		//���������¼���ֵ ��Сֵ �м�ֵ
		int max,min,mid;
		max=(a>b&&a>c)?a:(b>c?b:c);
		min=(a<b&&a<c)?a:(b<c?b:c);
		if((a-b)*(c-b)<0) {
			mid=b;
		}else if((c-a)*(b-a)<0) {
			mid=a;
		}else {
			mid=c;
		}
		System.out.println("a="+a+",b="+b+",c="+c+",���ֵ��:"+max+"����Сֵ��:"+min+"���м�ֵ�ǣ�"+mid);
		
		if(a>b&&a>c) {
			max=a;
			if(b>c) {
				mid=b;
				min=c;
			}else {
				mid=c;
				min=b;
			}
		}else if(b>c) {
			max=b;
			if(a>c) {
				mid=a;
				min=c;
			}else {
				mid=c;
				min=a;
			}
		}else {
			max=c;
			if(b>a) {
				mid=b;
				min=a;
			}else {
				mid=a;
				min=b;
			}
		}
		
	
		
		
		
		
		
		//	4  ��չ��1��
		//	          ʹ��swicth ���ݷ����жϵȼ�
		//			  ����[60,70)   ����[70,80)   ����[80,100]   ������[0,60)
		//			  switch��ͨ����ٷ��������ж�  
		//			  ��ʾ���Կ��ǣ�(int)(score/10)
		
		
		//	5  ��չ��2��ʹ��while��ʵ��
		//	          **����Բ����
		//				�й��Ŵ���ѧ���о����˼���Բ������򵥵İ취:
		//				PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17......
		//				�����ʽ�Ľ�������޽ӽ���Բ���ʵ�ֵ,
		//				�ҹ��Ŵ���ѧ�����֮�����,Բ������3.1415926 ��3.1415927 ֮��,
		//				���̼���,Ҫ��õ������Ľ��,��Ҫ�������ٴμӼ�������?
		//				ע�⣺������Ҫ�о� ѭ����������ÿ�μӼ������Ĺ���	
		//	6  ������ı������	
		
		
	

	}

}
