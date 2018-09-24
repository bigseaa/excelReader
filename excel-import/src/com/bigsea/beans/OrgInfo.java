package com.bigsea.beans;

import java.util.Date;

public class OrgInfo {
	//机构中文名称
	private String ORG_CHI_NAME = "";
	//法定代表人
	private String LEG_PER = "";
	//注册资本
	private String REG_CAP = "";
	//货币类型参数
	private Integer CURY_TYPE_PAR = 0;
	//统一社会信用代码
	private String UNI_SOC_CRE_CODE = "";
	//工商注册号
	private String IC_REG_CODE = "";
	//组织机构代码
	private String ORG_CODE = "";
	//开业日期
	private String STA_BUSI_DATE;
	//企业类型
	private String ORG_CLA_PAR = "";
	//经营状态
	private String OPER_COND = "";
	//行业大类
	private String INDU_BIG_PAR = "";
	//行业小类
	private String INDU_SMA_PAR = "";
	//电话
	private String ORG_TEL = "";
	//邮箱
	private String ORG_MAIL_ADDR = "";
	//网址
	private String ORG_WEB = "";
	//经营范围(clob)
	private String OPER_SCO = "";
	//注册地址
	private String REG_ADDR = "";
	//经营期限自
	private String OPER_STA_DATE = "";
	//经营期限至
	private String OPER_END_DATE = "";
	//发照日期
	private String PERMIT_DATE = "";
	//注销日期
	private String CANCEL_DATE = "";
	//登记机关
	private String REG_AUTH = "";
	public String getORG_CHI_NAME() {
		return ORG_CHI_NAME;
	}
	public void setORG_CHI_NAME(String oRG_CHI_NAME) {
		ORG_CHI_NAME = oRG_CHI_NAME;
	}
	public String getLEG_PER() {
		return LEG_PER;
	}
	public void setLEG_PER(String lEG_PER) {
		LEG_PER = lEG_PER;
	}
	
	public String getREG_CAP() {
		return REG_CAP;
	}
	public void setREG_CAP(String rEG_CAP) {
		REG_CAP = rEG_CAP;
	}
	public Integer getCURY_TYPE_PAR() {
		return CURY_TYPE_PAR;
	}
	public void setCURY_TYPE_PAR(Integer cURY_TYPE_PAR) {
		CURY_TYPE_PAR = cURY_TYPE_PAR;
	}
	public String getUNI_SOC_CRE_CODE() {
		return UNI_SOC_CRE_CODE;
	}
	public void setUNI_SOC_CRE_CODE(String uNI_SOC_CRE_CODE) {
		UNI_SOC_CRE_CODE = uNI_SOC_CRE_CODE;
	}
	public String getIC_REG_CODE() {
		return IC_REG_CODE;
	}
	public void setIC_REG_CODE(String iC_REG_CODE) {
		IC_REG_CODE = iC_REG_CODE;
	}
	public String getORG_CODE() {
		return ORG_CODE;
	}
	public void setORG_CODE(String oRG_CODE) {
		ORG_CODE = oRG_CODE;
	}
	
	public String getSTA_BUSI_DATE() {
		return STA_BUSI_DATE;
	}
	public void setSTA_BUSI_DATE(String sTA_BUSI_DATE) {
		STA_BUSI_DATE = sTA_BUSI_DATE;
	}
	public String getORG_CLA_PAR() {
		return ORG_CLA_PAR;
	}
	public void setORG_CLA_PAR(String oRG_CLA_PAR) {
		ORG_CLA_PAR = oRG_CLA_PAR;
	}
	public String getOPER_COND() {
		return OPER_COND;
	}
	public void setOPER_COND(String oPER_COND) {
		OPER_COND = oPER_COND;
	}
	public String getINDU_BIG_PAR() {
		return INDU_BIG_PAR;
	}
	public void setINDU_BIG_PAR(String iNDU_BIG_PAR) {
		INDU_BIG_PAR = iNDU_BIG_PAR;
	}
	public String getINDU_SMA_PAR() {
		return INDU_SMA_PAR;
	}
	public void setINDU_SMA_PAR(String iNDU_SMA_PAR) {
		INDU_SMA_PAR = iNDU_SMA_PAR;
	}
	public String getORG_TEL() {
		return ORG_TEL;
	}
	public void setORG_TEL(String oRG_TEL) {
		ORG_TEL = oRG_TEL;
	}
	public String getORG_MAIL_ADDR() {
		return ORG_MAIL_ADDR;
	}
	public void setORG_MAIL_ADDR(String oRG_MAIL_ADDR) {
		ORG_MAIL_ADDR = oRG_MAIL_ADDR;
	}
	public String getORG_WEB() {
		return ORG_WEB;
	}
	public void setORG_WEB(String oRG_WEB) {
		ORG_WEB = oRG_WEB;
	}
	public String getOPER_SCO() {
		return OPER_SCO;
	}
	public void setOPER_SCO(String oPER_SCO) {
		OPER_SCO = oPER_SCO;
	}
	public String getREG_ADDR() {
		return REG_ADDR;
	}
	public void setREG_ADDR(String rEG_ADDR) {
		REG_ADDR = rEG_ADDR;
	}
	
	public String getOPER_STA_DATE() {
		return OPER_STA_DATE;
	}
	public void setOPER_STA_DATE(String oPER_STA_DATE) {
		OPER_STA_DATE = oPER_STA_DATE;
	}
	public String getOPER_END_DATE() {
		return OPER_END_DATE;
	}
	public void setOPER_END_DATE(String oPER_END_DATE) {
		OPER_END_DATE = oPER_END_DATE;
	}
	public String getPERMIT_DATE() {
		return PERMIT_DATE;
	}
	public void setPERMIT_DATE(String pERMIT_DATE) {
		PERMIT_DATE = pERMIT_DATE;
	}
	public String getCANCEL_DATE() {
		return CANCEL_DATE;
	}
	public void setCANCEL_DATE(String cANCEL_DATE) {
		CANCEL_DATE = cANCEL_DATE;
	}
	public String getREG_AUTH() {
		return REG_AUTH;
	}
	public void setREG_AUTH(String rEG_AUTH) {
		REG_AUTH = rEG_AUTH;
	}
	@Override
	public String toString() {
		return "OrgInfo [ORG_CHI_NAME=" + ORG_CHI_NAME + ", LEG_PER=" + LEG_PER
				+ ", REG_CAP=" + REG_CAP + ", CURY_TYPE_PAR=" + CURY_TYPE_PAR
				+ ", UNI_SOC_CRE_CODE=" + UNI_SOC_CRE_CODE + ", IC_REG_CODE="
				+ IC_REG_CODE + ", ORG_CODE=" + ORG_CODE + ", STA_BUSI_DATE="
				+ STA_BUSI_DATE + ", ORG_CLA_PAR=" + ORG_CLA_PAR
				+ ", OPER_COND=" + OPER_COND + ", INDU_BIG_PAR=" + INDU_BIG_PAR
				+ ", INDU_SMA_PAR=" + INDU_SMA_PAR + ", ORG_TEL=" + ORG_TEL
				+ ", ORG_MAIL_ADDR=" + ORG_MAIL_ADDR + ", ORG_WEB=" + ORG_WEB
				+ ", OPER_SCO=" + OPER_SCO + ", REG_ADDR=" + REG_ADDR
				+ ", OPER_STA_DATE=" + OPER_STA_DATE + ", OPER_END_DATE="
				+ OPER_END_DATE + ", PERMIT_DATE=" + PERMIT_DATE
				+ ", CANCEL_DATE=" + CANCEL_DATE + ", REG_AUTH=" + REG_AUTH
				+ "]";
	}
}
