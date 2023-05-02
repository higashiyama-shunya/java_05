package excerice;

import lib.Input;

public class Pass05_03 {

	public static void main(String[] args) {
		double a,b,c;
		
		a=Input.getDouble();
		b=Input.getDouble();
		c=Input.getDouble();
		
		double d,e,f,sqrt,ans1,ans2;
		d=Math.pow(a, 2);
		e=Math.pow(b, 2);
		f=Math.pow(e, 2)-(4*d*(-2*c));
		sqrt=Math.sqrt(f);
		ans1=(-e+sqrt)/(2*d);
		ans2=(-e-sqrt)/(2*d);	//解の公式を部品ごとに分ける
								//sqrtが平方根を出したとき負の数だったらNaNが出る。
		System.out.println("(1)="+ans1);
		System.out.println("(2)="+ans2);
		
		double g,h,i,sq,ans3,ans4;
		g=Math.sqrt(a);
		h=Math.sqrt(b);
		i=Math.pow(h, 2)-(4*g*(3*c));
		sq=Math.sqrt(i);//ここがマイナスだった場合NaNになってしまう。
		ans3=(-h+sq)/(2*g);
		ans4=(-h-sq)/(2*g);
		System.out.println("(3)="+ans3);
		System.out.println("(4)="+ans4);
		
	}

}
