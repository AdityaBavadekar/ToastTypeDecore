# ToastTypeDecore:copyright:
- A library for easy implementation of Toasts in Android with easy customisation

##### Latest Version : [v1.3](https://github.com/AdityaBavadekar/ToastTypeDecore/releases/tag/v1.3)

Success Toast1 | Success Toast2
---------------- | --------------
| <img src="https://github.com/AdityaBavadekar/ToastTypeDecore/blob/main/20210928_161444.jpg" alt="Success Toast Demo"/> | <img src="https://github.com/AdityaBavadekar/ToastTypeDecore/blob/main/image.png" alt="Success Toast Demo"/> |

## Implementation
- Step 1. Add the JitPack repository to your build file
    >:information_source: Add it in your root __build.gradle ( project level )__ at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
- Step 2. Add the dependency
```gradle
	dependencies {
	        implementation 'com.github.AdityaBavadekar:ToastTypeDecore:Tag'
	}
```
## Tag for version : [![](https://jitpack.io/v/AdityaBavadekar/ToastTypeDecore.svg)](https://jitpack.io/#AdityaBavadekar/ToastTypeDecore) 
Version 1.3

## Usage :black_nib: :
##### _@Params: and Syntax_
```kotlin
//Syntax
ToastTypeDecore().makeSuccessToast(
        context: Context,
        contentText: String,
        successImageDrawableResId: Int?,
        cornerRadius: Float?,
        backgroundColor: Int?,
        longLengthenedToast : Boolean
    ) 

```
##### _Android Activity Usage_ :arrow_down:
```kotlin
//Activity usage in kotlin
...
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastTypeDecore().makeSuccessToast(
        this,//Context
        "Hello, World! from ToastTypeDecore",//String main message
        null//Int? drawable for success, `null` for Tick  default
        null//Float? toast corner radius, `null` for default
        Color.WHITE,//Int? background color `null` for default
        false//Boolean, `false`:short time toast, `true`:long time toast
      ) 



    }
    
}

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
