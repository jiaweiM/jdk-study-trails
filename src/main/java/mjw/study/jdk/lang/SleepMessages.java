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

package mjw.study.jdk.lang;

/**
 * @author JiaweiMao 2017-05-05
 * @since 1.0-SNAPSHOT
 */
public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {

        String infortantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (String anInfortantInfo : infortantInfo) {
            // sleep for 4 seconds
            Thread.sleep(4000);
            System.out.println(anInfortantInfo);
        }

    }

}
