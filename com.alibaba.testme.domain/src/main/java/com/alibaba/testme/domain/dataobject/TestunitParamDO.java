package com.alibaba.testme.domain.dataobject;
import java.util.Date;
/**
 * TestunitParamDO
 */
public class TestunitParamDO {

	/**
	 *id
	 */
	private Integer id;
	   
	/**
	 *gmtCreate
	 */
	private Date gmtCreate;
	   
	/**
	 *creator
	 */
	private String creator;
	   
	/**
	 *gmtModified
	 */
	private Date gmtModified;
	   
	/**
	 *modifier
	 */
	private String modifier;
	   
	/**
	 *labelName
	 */
	private String labelName;
	   
	/**
	 *paramName
	 */
	private String paramName;
	   
	/**
	 *formCtrlType
	 */
	private String formCtrlType;
	   
	/**
	 *testunitId
	 */
	private String testunitId;
	   
	/**
	 *defaultValue
	 */
	private String defaultValue;
	   
	/**
	 *rank
	 */
	private Integer rank;
	   
	/**
	 *isRequired
	 */
	private String isRequired;
	   
	/**
	 *help
	 */
	private String help;
	   


	public void setId(Integer id){ 
	   this.id = id; 
	}
	
	public Integer getId(){ 
	   return this.id; 
	} 

	public void setGmtCreate(Date gmtCreate){ 
	   this.gmtCreate = gmtCreate; 
	}
	
	public Date getGmtCreate(){ 
	   return this.gmtCreate; 
	} 

	public void setCreator(String creator){ 
	   this.creator = creator; 
	}
	
	public String getCreator(){ 
	   return this.creator; 
	} 

	public void setGmtModified(Date gmtModified){ 
	   this.gmtModified = gmtModified; 
	}
	
	public Date getGmtModified(){ 
	   return this.gmtModified; 
	} 

	public void setModifier(String modifier){ 
	   this.modifier = modifier; 
	}
	
	public String getModifier(){ 
	   return this.modifier; 
	} 

	public void setLabelName(String labelName){ 
	   this.labelName = labelName; 
	}
	
	public String getLabelName(){ 
	   return this.labelName; 
	} 

	public void setParamName(String paramName){ 
	   this.paramName = paramName; 
	}
	
	public String getParamName(){ 
	   return this.paramName; 
	} 

	public void setFormCtrlType(String formCtrlType){ 
	   this.formCtrlType = formCtrlType; 
	}
	
	public String getFormCtrlType(){ 
	   return this.formCtrlType; 
	} 

	public void setTestunitId(String testunitId){ 
	   this.testunitId = testunitId; 
	}
	
	public String getTestunitId(){ 
	   return this.testunitId; 
	} 

	public void setDefaultValue(String defaultValue){ 
	   this.defaultValue = defaultValue; 
	}
	
	public String getDefaultValue(){ 
	   return this.defaultValue; 
	} 

	public void setRank(Integer rank){ 
	   this.rank = rank; 
	}
	
	public Integer getRank(){ 
	   return this.rank; 
	} 

	public void setIsRequired(String isRequired){ 
	   this.isRequired = isRequired; 
	}
	
	public String getIsRequired(){ 
	   return this.isRequired; 
	} 

	public void setHelp(String help){ 
	   this.help = help; 
	}
	
	public String getHelp(){ 
	   return this.help; 
	} 

}