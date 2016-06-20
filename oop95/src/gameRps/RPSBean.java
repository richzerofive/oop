package gameRps;

public class RPSBean {
	private String play,comp;
	private int rcomp;
	
	public RPSBean(String play,String comp,int rcomp) {
		this.play=play;
		this.comp=comp;
		this.rcomp=rcomp;
}	
	@Override
	public String toString() {
		return "결과 [ 플레이어 ="+ play +"컴퓨터=" + comp;
	}
	
		public void setPlay(String play){
		this.play=play;
}
		public void setComp(String comp){
			this.comp=comp;
}
		public String getPlay(){
			return play;
}
		public String getComp(){
			return comp;
}


}

