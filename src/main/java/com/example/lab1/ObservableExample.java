package com.example.lab1;

import rx.Observable;
import rx.Subscriber;

import java.util.Arrays;
import java.util.List;

public class ObservableExample
{
	public static void main(String[] args) {
		System.out.println("System demo start:");

		List<String> list = Arrays.asList("one", "two", "three");

		Observable<String> observable = Observable.from(list);
		observable.subscribe(new Subscriber<String>()
		{
			@Override
			public void onCompleted()
			{
				System.out.println("Sequence completed!");
			}

			@Override
			public void onError(Throwable e)
			{
				System.err.println("Exception: " + e.getMessage());
			}

			@Override
			public void onNext(String _s)
			{
				System.out.println("next item is: " + _s);
			}
		});
	}
}
