package com.bigsea.test;

import com.bigsea.dao.OrgDao;
import com.bigsea.utils.ExcelReaderUtil2;
import com.bigsea.utils.IRowReader;
import com.bigsea.utils.RowReader;

public class TestReadExcel20180524 {
	public static void main(String[] args) throws Exception {
		IRowReader reader = new RowReader();  
		ExcelReaderUtil2.readExcel(reader, "d://javase/abc.xlsx");
		System.out.println(((RowReader) reader).getOrgInfoList().size());
		 long begin = System.currentTimeMillis();
		OrgDao orgDao = new OrgDao();
		orgDao.insertBatch(((RowReader) reader).getOrgInfoList());
		long end = System.currentTimeMillis();
	    System.out.println("插入用时：" + (end - begin) / 1000 + "秒");
	}
}
