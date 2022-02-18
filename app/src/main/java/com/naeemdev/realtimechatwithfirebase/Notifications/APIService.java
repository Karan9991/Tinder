package com.naeemdev.realtimechatwithfirebase.Notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA15FGcUM:APA91bFx5wih2oEgBYxJL5zGH55Z6uaRdrb0JJuFk5zwytUIIdnqwoX19KqvPrxrUt9yHaFx9moX6BQnUN54UgnFjPZomu-4HJzs-QnsRrrpawY_D8PIDZ2YDVs_UI-NpP08J_9f09uj"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
