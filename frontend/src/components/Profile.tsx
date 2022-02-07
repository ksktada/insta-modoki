import React from 'react';

type Props = {
    name: string
    id: string
    followers: number
    followings: number
}

const Profile: React.FC<Props> = (props) => {
    return (
        <div>
            <div>{props.name}</div>
            <div>{props.id}</div>
            <div>{props.followers}</div>
            <div>{props.followings}</div>
        </div>
    )
}

export default Profile;