import { Alert } from "react-bootstrap";

export default function Status({ user }) {
  return user ? (
    <Alert variant="success">
      Logged in (UserName: {user.username})
    </Alert>
  ) : (
    <Alert variant="danger">Not Logged In</Alert>
  );
}