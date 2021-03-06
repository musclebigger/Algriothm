# Algriothm and Desgin Pattern
算法学习和设计模式

**冒泡排序**

冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。

算法描述
1.比较相邻的元素。如果第一个比第二个大，就交换它们两个；
2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
3.针对所有的元素重复以上的步骤，除了最后一个；
4.重复步骤1~3，直到排序完成。

题目一poping根据leetcode上的题目作相对应测试

**选择排序**

选择排序的思想是：双重循环遍历数组，每经过一轮比较，找到最小元素的下标，将其交换至首位
冒泡排序在比较过程中就不断交换；而选择排序增加了一个变量保存最小值 / 最大值的下标，遍历完成后才交换，减少了交换次数。
事实上，冒泡排序和选择排序还有一个非常重要的不同点，那就是：
冒泡排序法是稳定的，选择排序法是不稳定的。
排序算法的稳定性
假定在待排序的记录序列中，存在多个具有相同的关键字的记录，若经过排序，这些记录的相对次序保持不变，即在原序列中，r[i] = r[j]，且 r[i] 在 r[j] 之前，而在排序后的序列中，r[i] 仍在 r[j] 之前，则称这种排序算法是稳定的；否则称为不稳定的。

理解了稳定性的定义后，我们就能分析出：冒泡排序中，只有左边的数字大于右边的数字时才会发生交换，相等的数字之间不会发生交换，所以它是稳定的。
而选择排序中，最小值和首位交换的过程可能会破坏稳定性。比如数列：[2, 2, 1]，在选择排序中第一次进行交换时，原数列中的两个 2 的相对顺序就被改变了，因此，我们说选择排序是不稳定的。

**单一职责Single responsibility principle**

每个类都应该有一个单一的功能，并且该功能应该由这个类完全封装起来，除非这个类是功能是最小的。
![image](http://c.biancheng.net/uploads/allimg/181113/3-1Q113133F4161.gif)
上图老师和辅导员为两个类并且功能独立。所以不能设计为一个老师类去执行辅导员的功能，这违反了单一职责。


**接口隔离interface-segregation principles**

客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。

未遵循接口隔离原则的设计:
![image](https://img-blog.csdnimg.cn/20200407103518354.png?…mNzZG4ubmV0L2F0dTExMTE=,size_16,color_FFFFFF,t_70)
修改后：
![image](https://img-blog.csdnimg.cn/20200407105850838.png?…mNzZG4ubmV0L2F0dTExMTE=,size_16,color_FFFFFF,t_70)

**依赖倒转Dependence Inversion Principles**

高层模块不应该依赖于低层模块而应该依赖于其抽象类，并且细节依赖于抽象。换句话说，不要再类里面区定义依赖于另一个类，而要将这个类归于一个接口。
实现方法三种: 接口，settter，构造器，都可以实现依赖倒转

不考虑dependence inversion：

![image](https://upload-images.jianshu.io/upload_images/14186083-2b425fd147530af4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

修改后（提高scalable，当增加需要引用的类时直接在接口里添加）：

![image](https://upload-images.jianshu.io/upload_images/14186083-22580545a2617fb5.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

**里氏替换Liskov subsititution Principles**

一种理想的继承类设计，子类尽量不重写父类方法。如果要重写建造一个基类会比替换父类方法好。


**开闭原则Open Closed Principles**
对于建造者可以扩展，但是对于使用者的修改要关闭。精髓对于变化要扩展而不是修改。
