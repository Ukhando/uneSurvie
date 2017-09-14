package uneSurvie.utils;

import uneSurvie.gfx.GameCamera;

public class Handler {
	
	
	private GameCamera gameCamera;
	
	
	
	
	
	public float getXOffset( ){
		return gameCamera.getXOffset();
	}
	
	public float getYOffset( ){
		return gameCamera.getYOffset();
	}
	
	public float getZoom( ){
		return gameCamera.getZoom();
	}
}
