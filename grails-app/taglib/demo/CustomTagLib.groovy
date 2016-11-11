package demo

class CustomTagLib {
    static defaultEncodeAs = [taglib:'html']

    def message = { attrs ->
        out << 'Custom Tag Lib Generated This'
    }
}
