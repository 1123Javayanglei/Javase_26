package com.zhiyou100.day04;

public class ZuoYe2 {

	public static void main(String[] args)throws Exception {
		
		//	4  ��չ��1��
		//	          ʹ��swicth ���ݷ����жϵȼ�
		//			  ����[60,70)   ����[70,80)   ����[80,100]   ������[0,60)
		//			  switch��ͨ����ٷ��������ж�  
		//			  ��ʾ���Կ��ǣ�(int)(score/10)
		//���������¼����
		double score=5.5;
		//ͨ��switch�ж�(int)(score/10)
		if(score<0||score>100) {
			 System.out.println("score="+score+",�������Ϸ�!");
		}else {
			 switch((int)(score/10)) {
			      case 6:
			    	  System.out.println("score="+score+",�ȼ��Ǽ���!");break;
			      case 7:
			    	  System.out.println("score="+score+",�ȼ�������!"); break;
			      case 8:
			      case 9:
			      case 10:
			    	  System.out.println("score="+score+",�ȼ�������!");break;
			      default:
			    	  System.out.println("score="+score+",�ȼ��ǲ�����!"); break;
		      }
		}
		
		//	5  ��չ��2��ʹ��while��ʵ��
		//	          **����Բ����:�й��Ŵ���ѧ���о����˼���Բ������򵥵İ취:
		//				PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17....�����ʽ�Ľ�������޽ӽ���Բ���ʵ�ֵ,
		//				�ҹ��Ŵ���ѧ�����֮�����,Բ������3.1415926 ��3.1415927 ֮��,���̼���,Ҫ��õ������Ľ��,��Ҫ�������ٴμӼ�������?
		//				ע�⣺������Ҫ�о� ѭ����������ÿ�μӼ������Ĺ���
		/*����ÿ�μ���pi�е���Ϊnum
		 *num���ص㣺  1:   ������Ϊ��  ż����Ϊ�� 2:���ӹ̶���4  3 :��ĸ��1��ʼÿ�μ�2
		 *����ѭ����������       pi>3.1415927||pi<3.1415926
		 *�����
	    */
		 //���������¼Բ���� ÿ�μӵ��� ����
		 int ciShu=1;
		 double PI=0;
		 double num=0;
		 while(PI>3.1415927||PI<3.1415926) {
			   if(ciShu%2==0) {
				   num=-4.0/(2*ciShu-1);
			   }else {
				   num=4.0/(2*ciShu-1); 
			   }
			   PI+=num;   ciShu++;
		 }
		 System.out.println("num="+num+",ciShu="+(ciShu-1)+",pi="+PI);
		
		//	6  ������ı������	

	}

}
