/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.notification;

/**
 * The {@code interface} is implemented by classes that are sending {@link INotification}
 * messages to registered {@link INotificationConsumer} instances.
 * 
 * @author Anastasios Patrikis
 */
public interface INotificationEmitter {

	/**
	 * Register a {@link INotificationConsumer} as receiver of {@link INotification} messages.
	 * 
	 * @param consumer the {@link INotificationConsumer} who wants to be notified.
	 * @return the current {@link INotificationEmitter} instance.
	 */
	public INotificationEmitter addConsumer(INotificationConsumer consumer);
	
	/**
	 * Unegister a {@link INotificationConsumer} as receiver of {@link INotification} messages.
	 * 
	 * @param consumer consumer the {@link INotificationConsumer} who does not want to be notified anymore.
	 * @return the current {@link INotificationEmitter} instance.
	 */
	public INotificationEmitter removeConsumer(INotificationConsumer consumer);

	/**
	 * Send a {@link INotification} with the given {@link INotification.Level} to the registered
	 * {@link INotificationConsumer} instances.
	 * 
	 * @param notification the {@link INotification} to send to the registered {@link INotificationConsumer}.
	 * @return the current {@link INotificationEmitter} instance.
	 */
	public INotificationEmitter emitNotification(INotification notification);
}
