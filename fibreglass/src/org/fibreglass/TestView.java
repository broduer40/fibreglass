package org.fibreglass;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class TestView extends View{
	
	private class Circle {
		public float mX, mY, mRadius;
		
		public Circle(float x, float y, float radius) {
			mX = x;
			mY = y;
			mRadius = radius;
		}
	}
	
	private ArrayList<Circle> mCircles;

	public TestView(Context context) {
		super(context);
		mCircles = new ArrayList<TestView.Circle>();
	}
	
	public void addCircle(float x, float y, float radius) {
		mCircles.add(new Circle(x, y, radius));
	}
	
	public void draw() {
		invalidate();
	}
	
	public void clear() {
		mCircles.clear();
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		addCircle(event.getX(), event.getY(), 20.f);
		draw();
		return true;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawColor(Color.BLACK);
		
		Paint paint = new Paint();
		paint.setColor(Color.CYAN);
		
		for (Circle circle : mCircles) {
			canvas.drawCircle(circle.mX, circle.mY, circle.mRadius, paint);
		}
	}

}
