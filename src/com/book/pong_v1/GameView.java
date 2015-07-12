package com.book.pong_v1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class GameView extends View {
	public GameView(Context context) {
		super(context);
	}
	
	public void onDraw(Canvas canvas) {
		canvas.drawRGB(0, 0, 255);
		Paint paint = new Paint();
		paint.setColor(Color.RED);
		canvas.drawRect(10, 10,60,60, paint);
	}

}
