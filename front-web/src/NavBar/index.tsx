import './styles.css'
import {ReactComponent as Logo} from './logo.svg'
import { Link } from 'react-router-dom';
function NavBar (){
    return(
        <nav className="main-navBar">
            <Logo/>
            <Link to="/" className="logo-test">DS Delivery</Link>
        </nav>
    )
}

export default NavBar;