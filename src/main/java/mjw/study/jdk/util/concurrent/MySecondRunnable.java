/*
 * Copyright 2017 JiaweiMao jiaweiM_philo@hotmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mjw.study.jdk.util.concurrent;

/**
 * @author JiaweiMao on 2017.05.17
 * @since 1.0-SNAPSHOT
 */
public class MySecondRunnable implements Runnable {
    @Override
    public void run() {
        System.out.printf("I'm running in thread %s \n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable runnable = new MySecondRunnable();
        for (int i = 0; i < 25; i++) {
            Thread thread = new Thread(runnable);
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}
