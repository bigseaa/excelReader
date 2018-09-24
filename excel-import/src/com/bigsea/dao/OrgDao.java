package com.bigsea.dao;

import java.io.Reader;
import java.io.StringReader;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.bigsea.beans.OrgInfo;
import com.bigsea.utils.DBUtil;

public class OrgDao {
	public String getUUID() {  
        return UUID.randomUUID().toString().replace("-", "");  
    }  
	//单条插入
	public boolean insert(List<OrgInfo> orgInfoList) throws Exception {
		boolean flag = true; 
		String sql = "insert into ORG_INFO(ORG_CHI_NAME,LEG_PER,REG_CAP," +
				"CURY_TYPE_PAR,UNI_SOC_CRE_CODE,IC_REG_CODE,ORG_CODE," +
				"STA_BUSI_DATE,ORG_CLA_PAR,OPER_COND,INDU_BIG_PAR,INDU_SMA_PAR,ORG_TEL," +
				"ORG_MAIL_ADDR,ORG_WEB,REG_ADDR,OPER_STA_DATE,OPER_END_DATE," +
				"PERMIT_DATE,CANCEL_DATE,REG_AUTH,CREATETIME,UPDATETIME,ORG_UNI_CODE,oper_SCO) " +
				"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		DBUtil dbUtil = 
				new DBUtil(sql);
		for(OrgInfo orgInfo : orgInfoList) {
			String org_CHI_NAME = orgInfo.getORG_CHI_NAME();
			String leg_PER = orgInfo.getLEG_PER();
			String reg_CAP = orgInfo.getREG_CAP();
			Integer cury_TYPE_PAR = orgInfo.getCURY_TYPE_PAR();
			String uni_SOC_CRE_CODE = orgInfo.getUNI_SOC_CRE_CODE();
			String ic_REG_CODE = orgInfo.getIC_REG_CODE();
			String org_CODE = orgInfo.getORG_CODE();
			//String sta_BUSI_DATE = orgInfo.getSTA_BUSI_DATE();
			String org_CLA_PAR = orgInfo.getORG_CLA_PAR();
			String oper_COND = orgInfo.getOPER_COND();
			String indu_BIG_PAR = orgInfo.getINDU_BIG_PAR();
			String indu_SMA_PAR = orgInfo.getINDU_SMA_PAR();
			String org_TEL = orgInfo.getORG_TEL();
			String org_MAIL_ADDR = orgInfo.getORG_MAIL_ADDR();
			String org_WEB = orgInfo.getORG_WEB();
			String oper_SCO = orgInfo.getOPER_SCO();
			String reg_ADDR = orgInfo.getREG_ADDR();
			String oper_STA_DATE = orgInfo.getOPER_STA_DATE();
			String oper_END_DATE = orgInfo.getOPER_END_DATE();
			String permit_DATE = orgInfo.getPERMIT_DATE();
			String cancel_DATE = orgInfo.getCANCEL_DATE();
			String reg_AUTH = orgInfo.getREG_AUTH();
			Reader clobReader = new StringReader(oper_SCO); 
			
			dbUtil.pst.setString(1, org_CHI_NAME);
			dbUtil.pst.setString(2, leg_PER);
			dbUtil.pst.setString(3, reg_CAP);
			dbUtil.pst.setInt(4, cury_TYPE_PAR);
			dbUtil.pst.setString(5, uni_SOC_CRE_CODE);
			dbUtil.pst.setString(6, ic_REG_CODE);
			dbUtil.pst.setString(7, org_CODE);
			//dbUtil.pst.setString(8, sta_BUSI_DATE);
			dbUtil.pst.setString(9, org_CLA_PAR);
			dbUtil.pst.setString(10, oper_COND);
			dbUtil.pst.setString(11, indu_BIG_PAR);
			dbUtil.pst.setString(12, indu_SMA_PAR);
			dbUtil.pst.setString(13, org_TEL);
			dbUtil.pst.setString(14, org_MAIL_ADDR);
			dbUtil.pst.setString(15, org_WEB);
			dbUtil.pst.setString(16, reg_ADDR);
			dbUtil.pst.setString(17, oper_STA_DATE);
			dbUtil.pst.setString(18, oper_END_DATE);
			dbUtil.pst.setString(19, permit_DATE);
			dbUtil.pst.setString(20, cancel_DATE);
			dbUtil.pst.setString(21, reg_AUTH);
			dbUtil.pst.setString(22, getUUID());
			dbUtil.pst.setCharacterStream(23, clobReader, oper_SCO.length());

			
			dbUtil.pst.execute();
			dbUtil.close();
		}
		return flag;
	}

	//批量插入
	public boolean insertBatch(List<OrgInfo> orgInfoList) throws Exception {
		boolean flag = true; 
		String sql = "insert into ORG_INFO(ORG_CHI_NAME,LEG_PER,REG_CAP," +
				"CURY_TYPE_PAR,UNI_SOC_CRE_CODE,IC_REG_CODE,ORG_CODE," +
				"STA_BUSI_DATE,ORG_CLA_PAR,OPER_COND,INDU_BIG_PAR,INDU_SMA_PAR,ORG_TEL," +
				"ORG_MAIL_ADDR,ORG_WEB,REG_ADDR,OPER_STA_DATE,OPER_END_DATE," +
				"PERMIT_DATE,CANCEL_DATE,REG_AUTH,ORG_UNI_CODE,oper_SCO) " +
				"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		DBUtil dbUtil = 
				new DBUtil(sql);
		for(int i = 0; i < orgInfoList.size(); i++) {
			String org_CHI_NAME = orgInfoList.get(i).getORG_CHI_NAME();
			String leg_PER = orgInfoList.get(i).getLEG_PER();
			String reg_CAP = orgInfoList.get(i).getREG_CAP();
			Integer cury_TYPE_PAR = orgInfoList.get(i).getCURY_TYPE_PAR();
			String uni_SOC_CRE_CODE = orgInfoList.get(i).getUNI_SOC_CRE_CODE();
			String ic_REG_CODE = orgInfoList.get(i).getIC_REG_CODE();
			String org_CODE = orgInfoList.get(i).getORG_CODE();
			String sta_BUSI_DATE = orgInfoList.get(i).getSTA_BUSI_DATE();
			String org_CLA_PAR = orgInfoList.get(i).getORG_CLA_PAR();
			String oper_COND = orgInfoList.get(i).getOPER_COND();
			String indu_BIG_PAR = orgInfoList.get(i).getINDU_BIG_PAR();
			String indu_SMA_PAR = orgInfoList.get(i).getINDU_SMA_PAR();
			String org_TEL = orgInfoList.get(i).getORG_TEL();
			String org_MAIL_ADDR = orgInfoList.get(i).getORG_MAIL_ADDR();
			String org_WEB = orgInfoList.get(i).getORG_WEB();
			String oper_SCO = orgInfoList.get(i).getOPER_SCO();
			String reg_ADDR = orgInfoList.get(i).getREG_ADDR();
			String oper_STA_DATE = orgInfoList.get(i).getOPER_STA_DATE();
			String oper_END_DATE = orgInfoList.get(i).getOPER_END_DATE();
			String permit_DATE = orgInfoList.get(i).getPERMIT_DATE();
			String cancel_DATE = orgInfoList.get(i).getCANCEL_DATE();
			String reg_AUTH = orgInfoList.get(i).getREG_AUTH();
			//Reader clobReader = new StringReader(oper_SCO);
			
			dbUtil.pst.setString(1, org_CHI_NAME);
			dbUtil.pst.setString(2, leg_PER);
			dbUtil.pst.setString(3, reg_CAP);
			dbUtil.pst.setInt(4, cury_TYPE_PAR);
			dbUtil.pst.setString(5, uni_SOC_CRE_CODE);
			dbUtil.pst.setString(6, ic_REG_CODE);
			dbUtil.pst.setString(7, org_CODE);
			dbUtil.pst.setString(8, sta_BUSI_DATE);
			dbUtil.pst.setString(9, org_CLA_PAR);
			dbUtil.pst.setString(10, oper_COND);
			dbUtil.pst.setString(11, indu_BIG_PAR);
			dbUtil.pst.setString(12, indu_SMA_PAR);
			dbUtil.pst.setString(13, org_TEL);
			dbUtil.pst.setString(14, org_MAIL_ADDR);
			dbUtil.pst.setString(15, org_WEB);
			dbUtil.pst.setString(16, reg_ADDR);
			dbUtil.pst.setString(17, oper_STA_DATE);
			dbUtil.pst.setString(18, oper_END_DATE);
			dbUtil.pst.setString(19, permit_DATE);
			dbUtil.pst.setString(20, cancel_DATE);
			dbUtil.pst.setString(21, reg_AUTH);
			dbUtil.pst.setString(22, getUUID());
			dbUtil.pst.setString(23, oper_SCO);
			//dbUtil.pst.setCharacterStream(23, clobReader, oper_SCO.length());
			dbUtil.pst.addBatch();
			try {
				if(i > 0 && i%10000 == 0) {
					dbUtil.pst.executeBatch();
					//dbUtil.conn.commit();
					//dbUtil.pst.clearBatch();	
				}
			} catch (Exception e) {
	            e.printStackTrace();
			} finally {
			}
		}
		dbUtil.pst.executeBatch();
		//dbUtil.conn.commit();
		dbUtil.close();
		
		return flag;
	}
}
