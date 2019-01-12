/*
 * Copyright 2013-2014 SmartBear Software
 * Copyright 2014-2019 The TestFX Contributors
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the
 * European Commission - subsequent versions of the EUPL (the "Licence"); You may
 * not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 * http://ec.europa.eu/idabc/eupl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the Licence is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the Licence for the
 * specific language governing permissions and limitations under the Licence.
 */
package org.testfx.framework.spock

import javafx.application.Application
import javafx.stage.Stage

final class ApplicationAdapter extends Application implements ApplicationFixture {

    private final ApplicationFixture applicationFixture

    ApplicationAdapter(ApplicationFixture applicationFixture) {
        this.applicationFixture = applicationFixture
    }

    @Override
    void init() throws Exception {
        applicationFixture.init()
    }

    @Override
    void start(Stage primaryStage) throws Exception {
        applicationFixture.start(primaryStage)
    }

    @Override
    void stop() throws Exception {
        applicationFixture.stop()
    }
}
