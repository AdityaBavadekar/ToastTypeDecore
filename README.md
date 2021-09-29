# ToastTypeDecore
- A library for easy implementation of Toasts in Android with easy customisation

- Success Toast
<img src="https://github.com/AdityaBavadekar/ToastTypeDecore/blob/main/image.png" alt="Success Toast Demo"/>
<img src="https://github.com/AdityaBavadekar/ToastTypeDecore/blob/main/20210928_161444.jpg" alt="Success Toast Demo"/>

## Implementation
- Step 1. Add the JitPack repository to your build file
    - Add it in your root build.gradle ( project level ) at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
- Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.AdityaBavadekar:ToastTypeDecore:1.1'
	}
```
## Tag for version : [![](https://jitpack.io/v/AdityaBavadekar/ToastTypeDecore.svg)](https://jitpack.io/#AdityaBavadekar/ToastTypeDecore) Version ```1.1```

## Usage :
```kotlin
ToastTypeDecore().showSuccessToast()
```

## License

```
Copyright 2021 Aditya Bavadekar.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements. See the NOTICE file distributed with this work for
additional information regarding copyright ownership. The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```

