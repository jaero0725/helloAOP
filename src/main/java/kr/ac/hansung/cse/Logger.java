package kr.ac.hansung.cse;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	@Pointcut("execution(void kr.ac.hansung.cse.*.sound())")
	private void selectSound() {} //메서드를 사용해서 아이디를 지정.
	
	@After("selectSound()")
	public void aboutToSound() {
		System.out.println("adivce : about to sound");
	}
}
