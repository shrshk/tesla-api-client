# tesla-api-client

Java library for interfacing with the Tesla Owner API. 

This library is generated using [swagger-codegen](https://github.com/swagger-api/swagger-codegen).
See [swagger.yml](swagger.yml) to view the Swagger document used to generate the library.

## Building Library from Swagger
2. If not already installed, install or obtain a release of `swagger-codegen`
   If on Mac and using Homebrew, you can use `brew install swagger-codegen`
3. Generate the library
   ```bash
   swagger-codegen generate \
   -i swagger.yml -l java -o . \
   --library retrofit2 --api-package com.github.jonahwh.tesla-api-client \
   --model-package com.github.jonahwh.tesla-api-client.model
   ```
   This will generate the library.
4. Build the library
   ```bash
   cd tesla-api-client # or whatever you set the -o option to
   gradle assemble # or `chmod +x ./gradlew && ./gradlew assemble`
   ``` 
5. The library will be built in `build/libs/`
   


