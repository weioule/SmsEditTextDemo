# SmsEditTextDemo
这是一个自定义短信验证码输入框


在开发中着用户系统的逐渐完善，短信验证码的需求基本上是必不可少的。

在常见的项目中，登录注册以及修改用户信息等流程都会涉及到短信验证。 与公共的功能类似，我们都会封装或者抽取出来，避免重写过多冗余的代码。

所以在开发的时候我们就要自定义一个发送短信验证码的控件，以便于我们在别的地方使用的时候就不要写着那么多重复的代码。

下面来看看效果图：

 &nbsp;&nbsp;
 ![image](https://github.com/weioule/SmsEditTextDemo/blob/master/app/img/001.png)
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 ![image](https://github.com/weioule/SmsEditTextDemo/blob/master/app/img/003.png)


就是这样的，一个文案，一个编辑框，一个发送短信按钮和一个清空按钮。具体来说这是一个自定义组合控件，将这些控件给组合起来，而发送短信的按钮又是一个自定义控件。因为涉及到倒计时，原生的控件还不能满足我们。

使用的时候就把要用的类copy到你的项目里，使用方法很简单，像MainActivity一样，给它设置一个监听事件就可以。两个回调方法，onGetVerifyPhone函数是传你输入的手机号过去检查，onSendVerificationCode函数是当点击发送短信时候的回调，在这里你就可以发送网络请求发送短信。

自定义控件的文案大小及颜色或背景在这里面自行设置，大部分APP里的验证码输入框基本都是统一的，没必要自定义属性。


