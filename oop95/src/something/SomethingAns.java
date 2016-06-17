/**
 * 
 */
package something;

/**
 *@date   : 2016. 6. 17.
 *@author : 박승주
 *@file   : SomethingAns.java
 *@story  : 
*/
public class SomethingAns {
	private String aaa,bbb;
	private int ccc,ddd;
	
	public SomethingAns(String bbb,int ccc) {
		this.bbb = bbb;
		this.ccc = ccc;
	}
	
	public void setAaa(String aaa){
		this.aaa = aaa;
	}
	public void setBbb(String bbb){
		this.bbb = bbb;
	}
	public void setDdd(int ddd){
		this.ddd = ddd;
	}
	public String getAaa(){
		return aaa;
	}
	public String getBbb(){
		return bbb;
	}
	public int getCcc(){
		return ccc;
	}
	public int getDdd(){
		return ddd;
	}
	
}
