import { useState, useEffect } from "react";
import Login from "./Components/Login";
import Signup from "./Components/Signup";
import Status from "./Components/Status";
import Logout from "./Components/Logout";
import DeleteAccountModal from "./Components/DeleteAccountModal";
import { Button, Container } from "react-bootstrap";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";

function App() {
  const [user, setUser] = useState(null);

  // Load from sessionStorage on refresh
  useEffect(() => {
    const stored = sessionStorage.getItem("user");
    if (stored) setUser(JSON.parse(stored));
  }, []);

  // Sync state → sessionStorage
  useEffect(() => {
    if (user) {
      sessionStorage.setItem("user", JSON.stringify(user));
    } else {
      sessionStorage.removeItem("user");
    }
  }, [user]);

  return (
    <Router>
  <Container className="mt-4">

    <nav className="mb-3">
      <Button as={Link} to="/login" variant="primary" className="me-2">
        Login
      </Button>
      <Button as={Link} to="/signup" variant="success">
        Signup
      </Button>
    </nav>

    <Routes>
      <Route path="/login" element={<Login setUser={setUser} />} />
      <Route path="/signup" element={<Signup setUser={setUser} />} />
    </Routes>

    <Status user={user} />

    {user && (
      <>
        <Logout setUser={setUser} />
        <DeleteAccountModal user={user} setUser={setUser} />
      </>
    )}

  </Container>
</Router>
  );
}

export default App;
