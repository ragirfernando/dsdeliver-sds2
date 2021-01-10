import './styles.css'
import {ReactComponent as Logo} from './logo.svg'
function NavBar (){
    return(
        <nav className="main-navBar">
            <Logo/>
            <a href="home" className="logo-test">DS Delivery</a>
        </nav>
    )
}

export default NavBar;