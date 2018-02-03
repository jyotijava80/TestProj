package DesignPatterns.CH02.designpatterns.strategy;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}