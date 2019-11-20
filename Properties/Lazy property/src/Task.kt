class LazyProperty(val initializer: () -> Int) {
    val _lazy: Int by lazy {initializer.invoke()}
    val lazy: Int
        get() {
            return _lazy
        }
}
