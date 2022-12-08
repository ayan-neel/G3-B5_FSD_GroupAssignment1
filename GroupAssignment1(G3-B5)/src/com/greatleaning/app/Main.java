/***
 * This is first group assignment from the Great Learning
 * The objective of this program is to obtain all departmental information from the college
 */

package com.greatleaning.app;

import com.greatleaning.department.AdminDepartment;
import com.greatleaning.department.HrDepartment;
import com.greatleaning.department.TechDepartment;

class Main {
	public static void main(String[] args) {

		HrDepartment hd = new HrDepartment();
		TechDepartment td = new TechDepartment();
		AdminDepartment ad = new AdminDepartment();

		// Administration Department
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayHoliday());

		// Human Resource Department
		System.out.println(hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayHoliday());

		// Technical Department
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayHoliday());

	}

}
