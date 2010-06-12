package org.openstreetmap.model;

public class Rule {

	Rule(String string) {
	}

	void Load()
	{
		LoadSymbols();
		LoadCSS();
		LoadFilters();
	}
	void Load(PointSymbolizer mSymbol12) {
		// TODO Auto-generated method stub
		mSymbol12.Load();
	}
	
	void Load(LineSymbolizer mSymbol12) {
		// TODO Auto-generated method stub
		mSymbol12.Load();
		
	}

	public void Load(stroke mCSS02) {
		// TODO Auto-generated method stub
		
	}

	protected void Load(stroke_width mCSS12) {
		// TODO Auto-generated method stub
		
	}

	public void Load(Filter mFilter12) {
		// TODO Auto-generated method stub
		mFilter12.exec();
	}
	
	public void LoadSymbols ()
	{
		// to be override by generated method 		
	}
	
	public void LoadCSS(){
	}
	public void LoadFilters(){}
}
