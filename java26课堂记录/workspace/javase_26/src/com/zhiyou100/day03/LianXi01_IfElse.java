package com.zhiyou100.day03;

public class LianXi01_IfElse {

	public static void main(String[] args) {
		// 1 ��ifelse���������Ĵ�ֵ��
		// ���������¼������
		// int a=2;int b=5;int c=-3;
		int a = 2, b = 5, c = -3;
		// ���������¼��ֵ
		int max;
		// ͨ��if else��max��ֵ max���������
		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {// b>c
			max = b;
		} else {
			max = c;
		}
		System.out.println(a + "," + b + "," + c + " �е����ֵ��:" + max);

		// 2 ��ifelse �����·��жϼ��ڣ�3 4 5 �� 6 7 8�� 9 10 11�� 12 1 2����
		// ���������¼�·�
		int month = 5;
		// ͨ��ifelse�Ķ��֧�жϼ���
		if (month <= 0 || month > 12) {
			System.out.println("month=" + month + ",�·ݲ��Ϸ�!");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("month=" + month + ",����!");
		} else if (month >= 6 && month <= 8) {
			System.out.println("month=" + month + ",����!");
		} else if (month >= 9 && month <= 11) {
			System.out.println("month=" + month + ",����!");
		} else {
			System.out.println("month=" + month + ",����!");
		}

		// 3 �������ж� �ǲ������꣺���Ա�4���������ܱ�100����,���Ա�400����
		// ���������¼��
		int year = 1000;
		// ͨ��ifelse�ж��Ƿ�Ϊ����
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("year=" + year + ",������!");
		} else {
			System.out.println("year=" + year + ",��������!");
		}

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("year=" + year + ",������!");
		} else if (year % 400 == 0) {
			System.out.println("year=" + year + ",������!");
		} else {
			System.out.println("year=" + year + ",��������!");
		}

		// 4 �����·ݺ��� �жϴ�������ж����죺
		year = 2019;month = 6;
		// ���������¼����
		int day;
		// 4�������31 30 28 29
		if (month <= 0 || month >= 13) {
			System.out.println("month=" + month + ",�·ݲ�����!");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(year + "��" + month + "����30��!");
		} else if ((month == 2) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
			// �ж��������� ����2��
			System.out.println(year + "��" + month + "�£��������2����29��!");
		} else if (month == 2) {
			// �ж��겻������ ����2��
			System.out.println(year + "��" + month + "�£����������2����28��!");
		} else {
			System.out.println(year + "��" + month + "����31��!");
		}

		if (month <= 0 || month >= 13) {
			System.out.println("month=" + month + ",�·ݲ�����!");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(year + "��" + month + "����30��!");
		} else if (month == 2) {
			//�ж��ǲ�������
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + "��" + month + "�£��������2����29��!");   
			}else {
				System.out.println(year + "��" + month + "�£����������2����28��!");
			}
		} else {
			System.out.println(year + "��" + month + "����31��!");
		}
	}
}
