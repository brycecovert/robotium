package com.jayway.android.robotium.solo;

class Sleeper {

	private final int PAUSE = 100;
	private final int MINIPAUSE = 50;

	/**
	 * Sleeps the current thread for a default pause length.
	 *
	 */

	public void sleep() {
        sleep(PAUSE);
	}


	/**
	 * Sleeps the current thread for a default mini pause length.
	 *
	 */

	public void sleepMini() {
        sleep(MINIPAUSE);
	}


	/**
	 * Sleeps the current thread for <code>time</code> milliseconds.
	 *
	 * @param time the length of the sleep in milliseconds
	 *
	 */

	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException ignored) {}
	}

}
