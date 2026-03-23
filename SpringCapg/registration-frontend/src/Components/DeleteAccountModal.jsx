import { useState } from "react";
import { Modal, Button, Form } from "react-bootstrap";
import axios from "axios";

export default function DeleteAccountModal({ user, setUser }) {
  const [show, setShow] = useState(false);
  const [password, setPassword] = useState("");

const handleDelete = async () => {
  try {
    const res = await axios.delete(
      "http://localhost:8080/auth/delete",
      {
        data: {
          username: user.username,
          password: password
        }
      }
    );

    if (res.data.success) {
      alert("Account deleted");
      setUser(null);
      setShow(false);
    }

  } catch (err) {
    if (err.response?.status === 401) {
      alert("Invalid credentials");
    } else {
      console.error(err);
    }
  }
};

  return (
    <>
      <Button
        variant="danger"
        style={{ position: "fixed", bottom: "20px", right: "20px" }}
        onClick={() => setShow(true)}
      >
        Delete Account
      </Button>

      <Modal show={show} onHide={() => setShow(false)}>
        <Modal.Header closeButton>
          <Modal.Title>Confirm Delete</Modal.Title>
        </Modal.Header>

        <Modal.Body>
          <Form.Control
            type="password"
            placeholder="Enter password"
            onChange={(e) => setPassword(e.target.value)}
          />
        </Modal.Body>

        <Modal.Footer>
          <Button variant="secondary" onClick={() => setShow(false)}>
            Cancel
          </Button>
          <Button variant="danger" onClick={handleDelete}>
            Delete
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  );
}