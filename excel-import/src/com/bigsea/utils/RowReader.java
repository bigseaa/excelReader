package com.bigsea.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bigsea.beans.OrgInfo;
import com.bigsea.dao.OrgDao;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;

/**
 * 实际使用当中只需写一个类实现IRowReader接口即可。调用方法参照test类
 */
public class RowReader implements IRowReader {
	private List<OrgInfo> orgInfoList = new ArrayList<OrgInfo>();

    public List<OrgInfo> getOrgInfoList() {
        return orgInfoList;
    }

    public void setOrgInfoList(List<OrgInfo> orgInfoList) {
        this.orgInfoList = orgInfoList;
    }

    /* 业务逻辑实现方法
     * @see com.eprosun.util.excel.IRowReader#getRows(int, int, java.util.List) 
     */  
	//机构中文名称
	private String ORG_CHI_NAME;
	//法定代表人
	private String LEG_PER;
	//注册资本
	private String REG_CAP;
	//货币类型参数
	private Integer CURY_TYPE_PAR;
	//统一社会信用代码
	private String UNI_SOC_CRE_CODE;
	//工商注册号
	private String IC_REG_CODE;
	//组织机构代码
	private String ORG_CODE;
	//开业日期
	private Date STA_BUSI_DATE;
	//企业类型
	private String ORG_CLA_PAR;
	//经营状态
	private String OPER_COND;
	//行业大类
	private String INDU_BIG_PAR;
	//行业小类
	private String INDU_SMA_PAR;
	//电话
	private String ORG_TEL;
	//邮箱
	private String ORG_MAIL_ADDR;
	//网址
	private String ORG_WEB;
	//经营范围(clob)
	private String OPER_SCO;
	//注册地址
	private String REG_ADDR;
	//经营期限自
	private String OPER_STA_DATE;
	//经营期限至
	private String OPER_END_DATE;
	//发照日期
	private String PERMIT_DATE;
	//注销日期
	private String CANCEL_DATE;
	//登记机关
	private String REG_AUTH;
	
    public void getRows(int sheetIndex, int curRow, List<String> rowlist) throws Exception {
    	OrgDao orgDao = new OrgDao();
    	OrgInfo orgInfo = new OrgInfo();
    	List<OrgInfo> list = new ArrayList<OrgInfo>();
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	SimpleDateFormat dataFormat2 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(curRow+" ");  
        for (int i = 0; i < rowlist.size(); i++) {  
        	switch(i){
        	case 0:
        		ORG_CHI_NAME = rowlist.get(i);
        		//此if判断是不将第一行标题行插入数据库中
        		if("企业名称".equals(ORG_CHI_NAME)) {
        			break;
        		}
        		if(ORG_CHI_NAME.getBytes().length > 200) {
        			ORG_CHI_NAME= split(ORG_CHI_NAME, 199);
        		}
        		orgInfo.setORG_CHI_NAME(ORG_CHI_NAME);
        	    break;
        	case 1:
        		LEG_PER = rowlist.get(i);
        		if("法定代表人".equals(LEG_PER)) {
        			break;
        		}
        		if(LEG_PER.getBytes().length > 150) {
        			LEG_PER = split(LEG_PER, 149);
        		}
        		orgInfo.setLEG_PER(LEG_PER);
        	    break;
        	case 2:
        		UNI_SOC_CRE_CODE = rowlist.get(i);
        		if("统一社会信用代码".equals(UNI_SOC_CRE_CODE)) {
        			break;
        		}
        		if(UNI_SOC_CRE_CODE.getBytes().length > 60) {
        			UNI_SOC_CRE_CODE = split(UNI_SOC_CRE_CODE, 59);
        		}
        		orgInfo.setUNI_SOC_CRE_CODE(UNI_SOC_CRE_CODE);
        	    break;
        	case 3:
        		IC_REG_CODE = rowlist.get(i);
        		if("注册号".equals(IC_REG_CODE)) {
        			break;
        		}
        		if(IC_REG_CODE.getBytes().length > 60) {
        			IC_REG_CODE = split(IC_REG_CODE, 59	);
        		}
        		orgInfo.setIC_REG_CODE(IC_REG_CODE);
        		break;
        	case 4:
        		ORG_CODE = rowlist.get(i);
        		if("组织机构代码".equals(ORG_CODE)) {
        			break;
        		}
        		if(ORG_CODE.getBytes().length > 60) {
        			ORG_CODE = split(ORG_CODE, 59);
        		}
        		orgInfo.setORG_CODE(ORG_CODE);
        	    break;
        	case 5:
        		String REG_CAP_STR = rowlist.get(i);
        		if("注册资本".equals(REG_CAP_STR)) {
        		    break;
                }
        		if(REG_CAP_STR.getBytes().length > 50) {
        			REG_CAP_STR = split(REG_CAP_STR, 49);
        		}
        		orgInfo.setREG_CAP(REG_CAP_STR);
        	    break;
        	case 6:
        	    String STA_BUSI_DATE_STR = rowlist.get(i);
                if("开业日期".equals(STA_BUSI_DATE_STR)) {
                    break;
                }
				if(STA_BUSI_DATE_STR.getBytes().length > 100) {
					STA_BUSI_DATE_STR = split(STA_BUSI_DATE_STR, 99);
				}
				orgInfo.setSTA_BUSI_DATE(STA_BUSI_DATE_STR);
        		break;
        	case 7:
        		ORG_CLA_PAR = rowlist.get(i);
        		if("企业类型".equals(ORG_CLA_PAR)) {
        			break;
        		}
        		if(ORG_CLA_PAR.getBytes().length > 100) {
        			ORG_CLA_PAR = split(ORG_CLA_PAR, 99);
        		}
        		orgInfo.setORG_CLA_PAR(ORG_CLA_PAR);
        	    break;
        	case 8:
        		OPER_COND = rowlist.get(i);
        		if("经营状态".equals(OPER_COND)) {
        			break;
        		}
        		if(OPER_COND.getBytes().length > 100) {
        			OPER_COND = split(OPER_COND, 99);
        		}
        		orgInfo.setOPER_COND(OPER_COND);
        	    break;
        	case 9:
        		INDU_BIG_PAR = rowlist.get(i);
        		if("行业大类".equals(INDU_BIG_PAR)) {
        			break;
        		}
        		if(INDU_BIG_PAR.getBytes().length > 100) {
        			INDU_BIG_PAR = split(INDU_BIG_PAR, 99);
        		}
        		orgInfo.setINDU_BIG_PAR(INDU_BIG_PAR);
        		break;
        	case 10:
        		INDU_SMA_PAR = rowlist.get(i);
        		if("行业小类".equals(INDU_SMA_PAR)) {
        			break;
        		}
        		if(INDU_SMA_PAR.getBytes().length > 100) {
        			INDU_SMA_PAR = split(INDU_SMA_PAR, 99);
        		}
        		orgInfo.setINDU_SMA_PAR(INDU_SMA_PAR);
        	    break;
        	case 11:
        		ORG_TEL = rowlist.get(i);
        		if("电话".equals(ORG_TEL)) {
        			break;
        		}
        		if(ORG_TEL.getBytes().length > 200) {
        			ORG_TEL = split(ORG_TEL, 199);
        		}
        		orgInfo.setORG_TEL(ORG_TEL);
        	    break;
        	case 12:
        		ORG_MAIL_ADDR = rowlist.get(i);
        		if("邮箱".equals(ORG_MAIL_ADDR)) {
        			break;
        		}
        		if(ORG_MAIL_ADDR.getBytes().length > 200) {
        			ORG_MAIL_ADDR = split(ORG_MAIL_ADDR, 199);
        		}
        		orgInfo.setORG_MAIL_ADDR(ORG_MAIL_ADDR);
        		break;
        	case 13:
        		ORG_WEB = rowlist.get(i);
        		if("网址".equals(ORG_WEB)) {
        			break;
        		}
        		if(ORG_WEB.getBytes().length > 2000) {
        			ORG_WEB = split(ORG_WEB, 1999);
        		}
        		orgInfo.setORG_WEB(ORG_WEB);
        	    break;
        	case 14:
        		OPER_SCO = rowlist.get(i);
        		if("经营范围".equals(OPER_SCO)) {
        			break;
        		}
        		if(OPER_SCO.getBytes().length > 2000) {
        			OPER_SCO = split(OPER_SCO, 1999);
        		}
        		orgInfo.setOPER_SCO(OPER_SCO);
        	    break;
        	case 15:
        		break;
        	case 16:
        		REG_ADDR = rowlist.get(i);
        		if("注册地址".equals(REG_ADDR)) {
        			break;
        		}
        		if(REG_ADDR.getBytes().length > 400) {
        			REG_ADDR = split(REG_ADDR, 399);
        		}
        		orgInfo.setREG_ADDR(REG_ADDR);
        	    break;
        	case 17:
        		OPER_STA_DATE = rowlist.get(i);
                if("经营期限自".equals(OPER_STA_DATE)) {
                    break;
                }
        		if(OPER_STA_DATE.getBytes().length > 60) {
        			OPER_STA_DATE = split(OPER_STA_DATE, 59);
        		}
        		orgInfo.setOPER_STA_DATE(OPER_STA_DATE);
        		break;
        	case 18:
        		OPER_END_DATE = rowlist.get(i);
                if("经营期限至".equals(OPER_END_DATE)) {
                    break;
                }
        		if(OPER_END_DATE.getBytes().length > 60) {
        			OPER_END_DATE = split(OPER_END_DATE, 59);
        		}
        		orgInfo.setOPER_END_DATE(OPER_END_DATE);
        	    break;
        	case 19:
        		PERMIT_DATE = rowlist.get(i);
                if("发照日期".equals(PERMIT_DATE)) {
                    break;
                }
        		if(PERMIT_DATE.getBytes().length > 60) {
        			PERMIT_DATE = split(PERMIT_DATE, 59);
        		}
        		orgInfo.setPERMIT_DATE(PERMIT_DATE);
        	    break;
        	case 20:
        		CANCEL_DATE = rowlist.get(i);
                if("注销日期".equals(CANCEL_DATE)) {
                    break;
                }
        		if(CANCEL_DATE.getBytes().length > 60) {
        			CANCEL_DATE = split(CANCEL_DATE, 59);
        		}
        		orgInfo.setCANCEL_DATE(CANCEL_DATE);
        	    break;
        	case 21:
        		REG_AUTH = rowlist.get(i);
        		
        		if("登记机关".equals(REG_AUTH)) {
        			break;
        		}
        		if(REG_AUTH.getBytes().length > 200) {
        			REG_AUTH = split(REG_AUTH, 199);
        		}
        		orgInfo.setREG_AUTH(REG_AUTH);
        		break;
        	default:
        	    break;
        	}
        	//当插入第一列的数据时（不管第几列），此时都是新创建并插入list集合中一个对象
        	if(i == 0) {
        		orgInfoList.add(orgInfo);
        	}
        }  
    }

    //如果字符串太长，进行截取操作
    public String split(String str, int len) throws Exception {
    	String newStr = "";
    	byte[] bytes = str.getBytes();
    	if(bytes.length <= len) {
    		return str;
    	} else if(bytes[len-1] < 0 && bytes[len] < 0) {
    		len -= 1;
    	}
    	byte[] newBytes = new byte[len];
    	for(int i = 0; i < len; i++) {
    		newBytes[i] = bytes[i];
    	}
    	newStr = new String(newBytes);
    	return newStr;
    }
    
}
