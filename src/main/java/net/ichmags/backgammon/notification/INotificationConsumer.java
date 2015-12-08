/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.notification;

/**
 * The {@code interface} is implemented by classes that are consuming {@link INotification}
 * messaged comming from the {@link INotificationEmitter} where they are registered.
 * 
 * @author Anastasios Patrikis
 */
public interface INotificationConsumer {

	/**
	 * Callback used by the {@link INotificationEmitter} to send a message
	 * to this registered {@link INotificationConsumer} class.
	 *  
	 * @param notification the {@link INotification} message to consume.
	 */
	public void message(INotification notification);
}
